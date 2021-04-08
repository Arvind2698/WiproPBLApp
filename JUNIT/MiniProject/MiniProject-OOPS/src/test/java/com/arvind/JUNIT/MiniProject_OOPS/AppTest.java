package com.arvind.JUNIT.MiniProject_OOPS;

import org.junit.jupiter.api.*;

public class AppTest{
	@Test
	@DisplayName("Testing the video creation and consistancy of the fields")
	public void videoCreatedSuccessufully() {
		Video video=new Video("NEW VIDEO");
		video.setRating(10);
		video.setCheckOutStatus(true);

		Assertions.assertEquals("NEW VIDEO",video.getVideoName());

		Assertions.assertEquals(10,video.getRating());
		
		Assertions.assertEquals(true,video.getCheckoutStatus());
	}
	
	@Test
	@DisplayName("Video should be created and added to the inventroy in video store")
	public void videoCreatedAndAddedToStore() {
		Video video=new Video("NEW VIDEO");
		VideoStore videoStore=new VideoStore();
		
		videoStore.addVideo(video);
		
		Assertions.assertEquals(1, videoStore.listInventory().size());
		Assertions.assertTrue(videoStore.listInventory()
				.stream().filter(v -> v.getVideoName().equals("NEW VIDEO") )
				.findAny()
				.isPresent());
	}
	
	@Test
	@DisplayName("Video should be checked out only when the checkout status is false")
	public void videoAllowedToCheckoutWhenCheckoutStstusIsFalse() {
		Video video=new Video("NEW VIDEO");
		VideoStore videoStore=new VideoStore();
		
		videoStore.addVideo(video);
		
		Assertions.assertTrue(videoStore.doCheckOut(video.getVideoName()));
	}
	
	@Test
	@DisplayName("Video should not be checked out when the checkout status is true")
	public void videoNotAllowedToCheckoutWhenCheckoutStstusIsTrue() {
		Video video=new Video("NEW VIDEO");
		video.setCheckOutStatus(true);
		VideoStore videoStore=new VideoStore();
		
		videoStore.addVideo(video);
	
		Assertions.assertFalse(videoStore.doCheckOut(video.getVideoName()));
	}
	
	@Test
	@DisplayName("Video should not be allowed to return when the check out status is false")
	public void videoNotAllowedToReturnWhenCheckoutStatusIsFalse() {
		Video video=new Video("NEW VIDEO");
		VideoStore videoStore=new VideoStore();
		
		videoStore.addVideo(video);
		
		Assertions.assertFalse(videoStore.doReturn(video.getVideoName()));
	}
	
	@Test
	@DisplayName("Video should allowed to return when the check out status is true")
	public void videoAllowedToReturnWhenCheckoutStatusIsTrue() {
		Video video=new Video("NEW VIDEO");
		VideoStore videoStore=new VideoStore();		
		videoStore.addVideo(video);
		
		videoStore.doCheckOut(video.getVideoName());
		
		Assertions.assertTrue(videoStore.doReturn(video.getVideoName()));
	}
	
}