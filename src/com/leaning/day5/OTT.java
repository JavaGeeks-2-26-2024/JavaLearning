package com.leaning.day5;

public class OTT {
	
	Movie[] movieary= new Movie[10];
	int moviePosition= 0;
	


	
	public void addMovie(String name, String content) {
		
		this.movieary[moviePosition] = new Movie(name, content);
		moviePosition++;
	}
	
	public void removeMovie(int position) {
		
		this.movieary[position]= null;
	}
	
	
	public Movie findAMovieByName(String name) {
		 Movie reqMovie=null;
		 
		for(int i=0; i < movieary.length;i++) {
			
			if(movieary[i].name.equals(name)) {
				
				reqMovie = movieary[i];
				
				break;
			}
		}
		
		return reqMovie;
	}
	
	
	public Movie findAMovieByPosition(int position) {
		
		return this.movieary[position];
		
	}
	
	public boolean updateMovieName(String oldName, String newName) {
		 
			for(int i=0; i < moviePosition;i++) {
				
				if(movieary[i].name == oldName) {
					
					movieary[i].name = newName;
					
					return true;
				}
			}
		
			return false;
	}
	
	
	 public void playAmovie(String name) {
		 
		 Movie myMovie = findAMovieByName(name);
		 
		 if(myMovie != null) {
			 myMovie.play();
		 }
	 }
	
}
