package com.shekar.practice.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class MediaPlayer {
	
	private Album album;
	
	@Autowired
	public MediaPlayer( Album album) {
		
		this.album = album;
	}

	public String getAlbum() {
		return album.getAlbum();
	}
	
	
	public String playTrack() {
		return album.getTrack();
	}
	
	@PostConstruct
	public void turnedOn() {
		System.out.println("\nMedia PLayer Turned ON");
	}
	
	@PreDestroy
	public void turnedOff() {
		System.out.println("\nMedia player turned OFF");
	}
}
