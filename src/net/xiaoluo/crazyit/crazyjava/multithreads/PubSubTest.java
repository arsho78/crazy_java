package net.xiaoluo.crazyit.crazyjava.multithreads;

import java.util.List;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class PubSubTest {
  public static void main(String[] args) {
    SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
    MySubscriber<String> subscriber = new MySubscriber<>();
    publisher.subscribe(subscriber);
    System.out.println("开始发布数据...");
    List.of("java", "spring", "hibernate", "maven").forEach(im -> {
      publisher.submit(im);
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });
    publisher.close();
    synchronized ("fkjava") {
      try {
        "fkjava".wait();
      } catch (InterruptedException e) {

      }
    }

  }
}

class MySubscriber<T> implements Flow.Subscriber<T> {
  private Flow.Subscription subscription;
  @Override
  public void onSubscribe(Flow.Subscription subscription) {
   this.subscription = subscription;
   subscription.request(1);
  }

  @Override
  public void onNext(T item) {
    System.out.println("取得数据" + item);
    subscription.request(1);
  }

  @Override
  public void onError(Throwable throwable) {
    throwable.printStackTrace();
    synchronized ("fkjava") {
      "fkjava".notifyAll();
    }
  }

  @Override
  public void onComplete() {
    System.out.println("订阅结束");
    synchronized ("fkjava") {
      "fkjava".notifyAll();
    }
  }
}


