package com.shekar.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shekar.practice.beans.MediaPlayer;

public class SpringDemo {

	public static void main(String[] args) {
		
		
		ApplicationContext beanContainer = new ClassPathXmlApplicationContext("app-context.xml");
	
		
		MediaPlayer mPlayer = beanContainer.getBean("mediaPlayer", MediaPlayer.class);
		
		MediaPlayer mPlayer2 = beanContainer.getBean("mediaPlayer", MediaPlayer.class);
		
		
		System.out.println(mPlayer==mPlayer2);
		
		System.out.println("\nAlbum: " + mPlayer.getAlbum());
		System.out.println("Playing now: " + mPlayer.playTrack() + "\n");

		
		((AbstractApplicationContext) beanContainer).close();
	}

}
