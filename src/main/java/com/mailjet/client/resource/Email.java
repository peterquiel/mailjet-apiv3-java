/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mailjet.client.resource;

import com.mailjet.client.Resource;

/**
 *
 * @author guillaume
 */
public class Email {
    
    public static Resource resource = new Resource("send", "");
    
    public static String FROMEMAIL = "FromEmail";
    public static String FROMNAME = "FromName";
    public static String SUBJECT = "Subject";
    public static String TEXTPART = "Text-Part";
    public static String HTMLPART = "Html-Part";
    public static String RECIPIENTS = "Recipients";
    public static String VARS = "Vars";
    public static String ATTACHMENTS = "Attachments";
    public static String INLINEATTACHMENTS = "Inline-Attachments";
    public static String MJPRIO = "Mj-prio";
    public static String MJCUSTOMID = "Mj-CustomID";
    public static String MJCAMPAIGN = "Mj-campaign";
    public static String MJDEDUPLICATECAMPAIGN = "Mj-deduplicatecampaign";
    public static String MJEVENTPAYLOAD = "Mj-EventPayload";
    public static String HEADERS = "Headers";
    public static String MESSAGE = "Message";
}