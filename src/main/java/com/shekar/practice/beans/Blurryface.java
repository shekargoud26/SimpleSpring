package com.shekar.practice.beans;

import org.springframework.stereotype.Component;

@Component
public class Blurryface implements Album {

	public Blurryface() {
		
	}

	public String getAlbum() {
	
		return "Blurryface";
	}

	public String getTrack() {
	
		return "Lane Boy";
	}

}
