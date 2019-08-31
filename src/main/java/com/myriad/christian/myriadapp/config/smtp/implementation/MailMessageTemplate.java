package com.myriad.christian.myriadapp.config.smtp.implementation;


import com.myriad.christian.myriadapp.models.Myriad;

import java.time.LocalDate;

public class MailMessageTemplate {

    public  String BookingConfirmation(Myriad passenger) {
        String body = "\n" +
                "\t<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n" +
                "\t<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                "\t<head>\n" +
                "\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                "\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n" +
                "\t\t<meta name=\"format-detection\" content=\"telephone=no\" /> <!-- disable auto telephone linking in iOS -->\n" +
                "\t\t<title>WWW.WORK.RW</title>\n" +
                "\t\t<style type=\"text/css\">\n" +
                "\t\t\t/* RESET STYLES */\n" +
                "\t\t\thtml { background-color:#E1E1E1; margin:0; padding:0; }\n" +
                "\t\t\tbody, #bodyTable, #bodyCell, #bodyCell{height:100% !important; margin:0; padding:0; width:100% !important;font-family:Helvetica, Arial, \"Lucida Grande\", sans-serif;}\n" +
                "\t\t\ttable{border-collapse:collapse;}\n" +
                "\t\t\ttable[id=bodyTable] {width:100%!important;margin:auto;max-width:500px!important;color:#7A7A7A;font-weight:normal;}\n" +
                "\t\t\timg, a img{border:0; outline:none; text-decoration:none;height:auto; line-height:100%;}\n" +
                "\t\t\ta {text-decoration:none !important;border-bottom: 1px solid;}\n" +
                "\t\t\th1, h2, h3, h4, h5, h6{color:#5F5F5F; font-weight:normal; font-family:Helvetica; font-size:20px; line-height:125%; text-align:Left; letter-spacing:normal;margin-top:0;margin-right:0;margin-bottom:10px;margin-left:0;padding-top:0;padding-bottom:0;padding-left:0;padding-right:0;}\n" +
                "\n" +
                "\t\t\t/* CLIENT-SPECIFIC STYLES */\n" +
                "\t\t\t.ReadMsgBody{width:100%;} .ExternalClass{width:100%;} /* Force Hotmail/Outlook.com to display emails at full width. */\n" +
                "\t\t\t.ExternalClass, .ExternalClass p, .ExternalClass span, .ExternalClass font, .ExternalClass td, .ExternalClass div{line-height:100%;} /* Force Hotmail/Outlook.com to display line heights normally. */\n" +
                "\t\t\ttable, td{mso-table-lspace:0pt; mso-table-rspace:0pt;} /* Remove spacing between tables in Outlook 2007 and up. */\n" +
                "\t\t\t#outlook a{padding:0;} /* Force Outlook 2007 and up to provide a \"view in browser\" message. */\n" +
                "\t\t\timg{-ms-interpolation-mode: bicubic;display:block;outline:none; text-decoration:none;} /* Force IE to smoothly render resized images. */\n" +
                "\t\t\tbody, table, td, p, a, li, blockquote{-ms-text-size-adjust:100%; -webkit-text-size-adjust:100%; font-weight:normal!important;} /* Prevent Windows- and Webkit-based mobile platforms from changing declared text sizes. */\n" +
                "\t\t\t.ExternalClass td[class=\"ecxflexibleContainerBox\"] h3 {padding-top: 10px !important;} \n" +
                "\t\t\th1{display:block;font-size:26px;font-style:normal;font-weight:normal;line-height:100%;}\n" +
                "\t\t\th2{display:block;font-size:20px;font-style:normal;font-weight:normal;line-height:120%;}\n" +
                "\t\t\th3{display:block;font-size:17px;font-style:normal;font-weight:normal;line-height:110%;}\n" +
                "\t\t\th4{display:block;font-size:18px;font-style:italic;font-weight:normal;line-height:100%;}\n" +
                "\t\t\t.flexibleImage{height:auto;}\n" +
                "\t\t\t.linkRemoveBorder{border-bottom:0 !important;}\n" +
                "\t\t\ttable[class=flexibleContainerCellDivider] {padding-bottom:0 !important;padding-top:0 !important;}\n" +
                "\n" +
                "\t\t\tbody, #bodyTable{background-color:#E1E1E1;}\n" +
                "\t\t\t#emailHeader{background-color:#E1E1E1;}\n" +
                "\t\t\t#emailBody{background-color:#FFFFFF;}\n" +
                "\t\t\t#emailFooter{background-color:#E1E1E1;}\n" +
                "\t\t\t.nestedContainer{background-color:#F8F8F8; border:1px solid #CCCCCC;}\n" +
                "\t\t\t.emailButton{background-color:#205478; border-collapse:separate;}\n" +
                "\t\t\t.buttonContent{color:#FFFFFF; font-family:Helvetica; font-size:18px; font-weight:bold; line-height:100%; padding:15px; text-align:center;}\n" +
                "\t\t\t.buttonContent a{color:#FFFFFF; display:block; text-decoration:none!important; border:0!important;}\n" +
                "\t\t\t.emailCalendar{background-color:#FFFFFF; border:1px solid #CCCCCC;}\n" +
                "\t\t\t.emailCalendarMonth{background-color:#205478; color:#FFFFFF; font-family:Helvetica, Arial, sans-serif; font-size:16px; font-weight:bold; padding-top:10px; padding-bottom:10px; text-align:center;}\n" +
                "\t\t\t.emailCalendarDay{color:#205478; font-family:Helvetica, Arial, sans-serif; font-size:60px; font-weight:bold; line-height:100%; padding-top:20px; padding-bottom:20px; text-align:center;}\n" +
                "\t\t\t.imageContentText {margin-top: 10px;line-height:0;}\n" +
                "\t\t\t.imageContentText a {line-height:0;}\n" +
                "\t\t\t#invisibleIntroduction {display:none !important;} /* Removing the introduction text from the view */\n" +
                "\n" +
                "\t\t\t/*FRAMEWORK HACKS & OVERRIDES */\n" +
                "\t\t\tspan[class=ios-color-hack] a {color:#275100!important;text-decoration:none!important;} /* Remove all link colors in IOS (below are duplicates based on the color preference) */\n" +
                "\t\t\tspan[class=ios-color-hack2] a {color:#205478!important;text-decoration:none!important;}\n" +
                "\t\t\tspan[class=ios-color-hack3] a {color:#8B8B8B!important;text-decoration:none!important;}\n" +
                "\t\t\t\n" +
                "\t\t\t.a[href^=\"tel\"], a[href^=\"sms\"] {text-decoration:none!important;color:#606060!important;pointer-events:none!important;cursor:default!important;}\n" +
                "\t\t\t.mobile_link a[href^=\"tel\"], .mobile_link a[href^=\"sms\"] {text-decoration:none!important;color:#606060!important;pointer-events:auto!important;cursor:default!important;}\n" +
                "\n" +
                "\n" +
                "\t\t\t/* MOBILE STYLES */\n" +
                "\t\t\t@media only screen and (max-width: 480px){\n" +
                "\t\t\t\t/*////// CLIENT-SPECIFIC STYLES //////*/\n" +
                "\t\t\t\tbody{width:100% !important; min-width:100% !important;} \n" +
                "\t\t\t\ttable[id=\"emailHeader\"],\n" +
                "\t\t\t\ttable[id=\"emailBody\"],\n" +
                "\t\t\t\ttable[id=\"emailFooter\"],\n" +
                "\t\t\t\ttable[class=\"flexibleContainer\"],\n" +
                "\t\t\t\ttd[class=\"flexibleContainerCell\"] {width:100% !important;}\n" +
                "\t\t\t\ttd[class=\"flexibleContainerBox\"], td[class=\"flexibleContainerBox\"] table {display: block;width: 100%;text-align: left;}\n" +
                "\t\t\t\t\n" +
                "\t\t\t\ttd[class=\"imageContent\"] img {height:auto !important; width:100% !important; max-width:100% !important; }\n" +
                "\t\t\t\timg[class=\"flexibleImage\"]{height:auto !important; width:100% !important;max-width:100% !important;}\n" +
                "\t\t\t\timg[class=\"flexibleImageSmall\"]{height:auto !important; width:auto !important;}\n" +
                "\n" +
                "\n" +
                "\t\t\t\t/*\n" +
                "\t\t\t\tCreate top space for every second element in a block\n" +
                "\t\t\t\t*/\n" +
                "\t\t\t\ttable[class=\"flexibleContainerBoxNext\"]{padding-top: 10px !important;}\n" +
                "\n" +
                "\t\t\t\t/*\n" +
                "\t\t\t\tMake buttons in the email span the\n" +
                "\t\t\t\tfull width of their container, allowing\n" +
                "\t\t\t\tfor left- or right-handed ease of use.\n" +
                "\t\t\t\t*/\n" +
                "\t\t\t\ttable[class=\"emailButton\"]{width:100% !important;}\n" +
                "\t\t\t\ttd[class=\"buttonContent\"]{padding:0 !important;}\n" +
                "\t\t\t\ttd[class=\"buttonContent\"] a{padding:15px !important;}\n" +
                "\n" +
                "\t\t\t}\n" +
                "\n" +
                "\t\t\t/*  CONDITIONS FOR ANDROID DEVICES ONLY\n" +
                "\t\t\t*   http://developer.android.com/guide/webapps/targeting.html\n" +
                "\t\t\t*   http://pugetworks.com/2011/04/css-media-queries-for-targeting-different-mobile-devices/ ;\n" +
                "\t\t\t=====================================================*/\n" +
                "\n" +
                "\t\t\t@media only screen and (-webkit-device-pixel-ratio:.75){\n" +
                "\t\t\t\t/* Put CSS for low density (ldpi) Android layouts in here */\n" +
                "\t\t\t}\n" +
                "\n" +
                "\t\t\t@media only screen and (-webkit-device-pixel-ratio:1){\n" +
                "\t\t\t\t/* Put CSS for medium density (mdpi) Android layouts in here */\n" +
                "\t\t\t}\n" +
                "\n" +
                "\t\t\t@media only screen and (-webkit-device-pixel-ratio:1.5){\n" +
                "\t\t\t\t/* Put CSS for high density (hdpi) Android layouts in here */\n" +
                "\t\t\t}\n" +
                "\t\t\t/* end Android targeting */\n" +
                "\n" +
                "\t\t\t/* CONDITIONS FOR IOS DEVICES ONLY\n" +
                "\t\t\t=====================================================*/\n" +
                "\t\t\t@media only screen and (min-device-width : 320px) and (max-device-width:568px) {\n" +
                "\n" +
                "\t\t\t}\n" +
                "\t\t\t/* end IOS targeting */\n" +
                "\t\t</style>\n" +
                "\t\t\n" +
                "\t</head>\n" +
                "\t<body bgcolor=\"#E1E1E1\" leftmargin=\"0\" marginwidth=\"0\" topmargin=\"0\" marginheight=\"0\" offset=\"0\">\n" +
                "\n" +
                "\t\n" +
                "\t\t<center style=\"background-color:#E1E1E1;\">\n" +
                "\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" height=\"100%\" width=\"100%\" id=\"bodyTable\" style=\"table-layout: fixed;max-width:100% !important;width: 100% !important;min-width: 100% !important;\">\n" +
                "\t\t\t\t<tr>\n" +
                "\t\t\t\t\t<td align=\"center\" valign=\"top\" id=\"bodyCell\">\n" +
                "\t\t\t\t\t\t<table bgcolor=\"#E1E1E1\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"500\" id=\"emailHeader\">\n" +
                "\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\">\n" +
                "\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"10\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\" valign=\"middle\" id=\"invisibleIntroduction\" class=\"flexibleContainerBox\" style=\"display:none !important; mso-hide:all;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width:100%;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\" class=\"textContent\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div style=\"font-family:Helvetica,Arial,sans-serif;font-size:13px;color:#828282;text-align:center;line-height:120%;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tThe introduction of your message preview goes here. Try to make it short.\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"right\" valign=\"middle\" class=\"flexibleContainerBox\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width:100%;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\" class=\"textContent\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- CONTENT // -->\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div style=\"font-family:Helvetica,Arial,sans-serif;font-size:13px;color:#828282;text-align:center;line-height:120%;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tIf you can't see this message, <a href=\"#\" target=\"_blank\" style=\"text-decoration:none;border-bottom:1px solid #828282;color:#828282;\"><span style=\"color:#828282;\">view&nbsp;it&nbsp;in&nbsp;your&nbsp;browser</span></a>.\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<!-- // FLEXIBLE CONTAINER -->\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t<!-- // CENTERING TABLE -->\n" +
                "\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t<!-- // END -->\n" +
                "\n" +
                "\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t<table bgcolor=\"#FFFFFF\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"500\" id=\"emailBody\">\n" +
                "\n" +
                "\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\">\n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"color:#FFFFFF;\" bgcolor=\"#3498db\">\n" +
                "\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"30\" cellspacing=\"0\" width=\"100%\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\" class=\"textContent\">\n" +
                "<h5 style=\"color:#FFFFFF;line-height:100%;font-family:Helvetica,Arial,sans-serif;font-size:20px;font-weight:normal;margin-bottom:5px;float:left!important;\"><br>Myriads for Jesus <br/>Christians only social media!</h5><br/><br/><br/><br/><br/>" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h5 style=\"text-align:center;font-weight:normal;font-family:Helvetica,Arial,sans-serif;font-size:20px;margin-bottom:5px;color:#205478;line-height:135%;\">Email Confirmation</h5>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\">\n" +
                "\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" bgcolor=\"#F8F8F8\">\n" +
                "\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"30\" cellspacing=\"0\" width=\"100%\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"textContent\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h3 mc:edit=\"header\" style=\"color:#5F5F5F;line-height:125%;font-family:Helvetica,Arial,sans-serif;font-size:20px;font-weight:normal;margin-top:0;margin-bottom:3px;text-align:left;\">" + passenger.getFirstName() + " " + passenger.getLastName() + "</h3>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div mc:edit=\"body\" style=\"text-align:left;font-family:Helvetica,Arial,sans-serif;font-size:15px;margin-bottom:0;color:#5F5F5F;line-height:135%;\"> Thank you for joining myriads for Jesus. <br/><br/>Click on the link below to confirm your email., <br/> </div>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\">\n" +
                "\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "\t\t\t\t\t\t\t\t\t\t<tr style=\"padding-top:0;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<!-- FLEXIBLE CONTAINER // -->\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"30\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td style=\"padding-top:0;\" align=\"center\" valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- CONTENT TABLE // -->\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"50%\" class=\"emailButton\" style=\"background-color: #3498DB;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"middle\" class=\"buttonContent\" style=\"padding-top:15px;padding-bottom:15px;padding-right:15px;padding-left:15px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a style=\"color:#FFFFFF;text-decoration:none;font-family:Helvetica,Arial,sans-serif;font-size:20px;line-height:135%;\" href=\"http://www.localhost:8081/users/activate?useremail="+passenger.getEmailAddress() +"\" >Confirm Email</a>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t<table bgcolor=\"#E1E1E1\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"500\" id=\"emailFooter\">\n" +
                "\n" +
                "\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\">\n" +
                "\t\t\t\t\t\t\t\t\t<!-- CENTERING TABLE // -->\n" +
                "\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<!-- FLEXIBLE CONTAINER // -->\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"500\" class=\"flexibleContainer\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\" width=\"500\" class=\"flexibleContainerCell\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"30\" cellspacing=\"0\" width=\"100%\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" bgcolor=\"#E1E1E1\">\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div style=\"font-family:Helvetica,Arial,sans-serif;font-size:13px;color:#828282;text-align:center;line-height:120%;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>Copyright &#169;"+ LocalDate.now().getYear()+" <a href=\"http://www.myriadsforjesus.com/\" target=\"_blank\" style=\"text-decoration:none;color:#828282;\"><span style=\"color:#828282;\">Myriads for Jesus</span></a>. All&nbsp;rights&nbsp;reserved.</div>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>If you do not want to recieve emails from us, you can <a href=\"#\" target=\"_blank\" style=\"text-decoration:none;color:#828282;\"><span style=\"color:#828282;\">unsubscribe</span></a>.</div>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t</td>\n" +
                "\t\t\t\t</tr>\n" +
                "\t\t\t</table>\n" +
                "\t\t</center>\n" +
                "\t</body>\n" +
                "</html>\n";
        return body;
    }

}
