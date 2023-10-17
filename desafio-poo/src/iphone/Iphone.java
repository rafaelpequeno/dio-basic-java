package iphone;

import iphone.phone.Phone;
import iphone.player.Player;
import iphone.safari.Safari;

public class Iphone implements Phone, Player, Safari {
  public static void main(String[] args) {
    Iphone iphone = new Iphone();
    iphone.call();
    iphone.answer();
    iphone.voiceMail();

    iphone.play();
    iphone.pause();
    iphone.selectMusic();

    iphone.showPage();
    iphone.addTab();
    iphone.refreshTab();
  }

  @Override
  public void call() {
    System.out.println("Calling...");
  }

  @Override
  public void answer() {
    System.out.println("Answering...");
  }

  @Override
  public void voiceMail() {
    System.out.println("Voice Mail...");
  }

  @Override
  public void play() {
    System.out.println("Playing...");
  }

  @Override
  public void pause() {
    System.out.println("Pausing...");
  }

  @Override
  public void selectMusic() {
    System.out.println("Selecting music...");
  }

  @Override
  public void showPage() {
    System.out.println("Showing page...");
  }

  @Override
  public void addTab() {
    System.out.println("Adding tab...");
  }

  @Override
  public void refreshTab() {
    System.out.println("Refreshing tab...");
  }
}
