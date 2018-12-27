package net.xiaoluo.crazyit.crazyjava.reflect;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

public class CompileClassLoader extends ClassLoader {
    private byte[] getBytes(String fileName) throws IOException {
        File file = new File(fileName);
        long len = file.length();
        byte[] raw = new byte[(int) len];
        try (FileInputStream in = new FileInputStream(file)) {
            int read = in.read(raw);
            if (read != len) {
                throw new IOException("无法读取全部文件： " + read + "/" + len);
            } //end if
            return raw;
        }  //end try
    }

    private boolean compile(String javaFile) throws IOException {
        System.out.println("CompileClassLoader正在编译" + javaFile + "...");
        Process p = Runtime.getRuntime().exec("javac " + javaFile);
        try {
            p.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return p.exitValue() == 0;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class clazz = null;
        String filePath = name.replace(".", "/");
        String javaFileName = filePath + ".java";
        String classFileName = filePath + ".class";
        File javaFile = new File(javaFileName);
        File classFile = new File(classFileName);

        if ((javaFile.exists() && (!classFile.exists())) ||
            (javaFile.lastModified() > classFile.lastModified())) {
            try {
                if (!compile(javaFileName) && !classFile.exists()) {
                    throw new ClassNotFoundException("ClassNotFoundException: " + javaFileName);
                } //end if
            } catch (IOException e) {
                e.printStackTrace();
            }
        } //end if

        if (classFile.exists()) {
            byte[] raw = new byte[0];
            try {
                raw = getBytes(classFileName);
                clazz = defineClass(name, raw, 0, raw.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } //end if

        if (clazz == null) {
            throw new ClassNotFoundException(name);
        } //end if

        return clazz;
    }

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("缺少目标类，请按如下格式运行Java源文件：");
            System.out.println("java CompileClassLoader ClassName");
        } //end if

        String procClass = args[0];
        String[] procArgs = new String[args.length - 1];
        System.arraycopy(args, 1, procArgs, 0, procArgs.length);
        ClassLoader cl = new CompileClassLoader();
        Class<?> clazz = cl.loadClass(procClass);
        Method main = clazz.getMethod("main", (new String[0]).getClass());
        Object[] argsArray = {procArgs};
        main.invoke(null, argsArray);
    }
}
