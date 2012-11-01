/*
 * BmTools.java
 *
 * Created on 1 novembre 2012, 00:10
 */
 
package com.aitbraham.bmtools;           

import com.vaadin.Application;
import com.vaadin.ui.*;
import com.vaadin.data.*;
/** 
 *
 * @author Nasnet
 * @version 
 */

public class BmTools extends Application {

    @Override
    public void init() {
	Window mainWindow = new Window("BmTools");
        Label label = new Label("Hello Vaadin user");
	mainWindow.addComponent(label);
	setMainWindow(mainWindow);
    }

}
