package com.shekar.practice.beans;

import org.springframework.stereotype.Component;

@Component
public class HybridTheory implements Album {

	public HybridTheory() {
	
	}

	public String getAlbum() {
	
		return "HybridTheory";
	}

	public String getTrack() {
		
		return "Papercut";
	}

}
