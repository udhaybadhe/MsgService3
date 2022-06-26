package org.project.service;

import org.junit.Assert;
import org.junit.Test;

public class MsgServiceTest1 {

     @Test
     public void should_return_the_helllo_world_message()
     
     {
     
     //Given
     
     MsgService msg = new MsgService();
     String expected = "Helllo World";
     
     // when
     String message = msg.getmessage();
     
     
    //then
     Assert.assertEquals(expected , message);
     
     }}
  