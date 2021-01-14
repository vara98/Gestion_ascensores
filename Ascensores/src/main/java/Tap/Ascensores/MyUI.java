package Tap.Ascensores;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {
	
	private Edificio edificio = new Edificio();


    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();
        
        final HorizontalLayout hlayout = new HorizontalLayout();
        
        Ascensor a1 = new Ascensor(3);
        Ascensor a2 = new Ascensor(2);
        Ascensor a3 = new Ascensor(1);
        
        layout.addComponent(new Label(
                "<h1>\tPRÁCTICA 2 TAP</h1>\n" +
                "<p>LLAMAR ASCENSOR</p>",
                ContentMode.HTML));
        
        
        
   
                             	
     //---------------------------------------------------------------
     	
     	hlayout.addComponent(new Button("LLAMAR AL ASCENSOR 1\n",
     			click -> {
     			Window subWindow = new Window("ASCENSOR 1");
                VerticalLayout subContent = new VerticalLayout();
                subWindow.setContent(subContent);
                
             

                // Set window size.
                subWindow.setHeight("600px");
                subWindow.setWidth("400px");
             // Set window position.
                subWindow.setPositionX(800);
                subWindow.setPositionY(50);


                // Put some components in it
                subContent.addComponent(new Label("ESTAS USANDO EL ASCENSOR 1\n"));
                
                subContent.addComponent(new Button("1\n",
                        e -> {Notification.show("LLAMANDO PISO 1");
                        edificio.llamarAscensor(a1, 1);
                        
                        }));
                
                subContent.addComponent(new Button("2",
                        e -> {Notification.show("LLAMANDO PISO 2");
                        edificio.llamarAscensor(a1, 2);
                        
                        }));
                subContent.addComponent(new Button("3",
                        e -> {Notification.show("LLAMANDO PISO 3");
                        edificio.llamarAscensor(a1, 3);
                        
                        }));
                subContent.addComponent(new Button("4",
                        e -> {Notification.show("LLAMANDO PISO 4");
                        edificio.llamarAscensor(a1, 4);
                        
                        }));
                subContent.addComponent(new Button("5",
                        e -> {Notification.show("LLAMANDO PISO 5");
                        edificio.llamarAscensor(a1, 5);
                        
                        }));
                subContent.addComponent(new Button("6",
                        e -> {Notification.show("LLAMANDO PISO 6");
                        edificio.llamarAscensor(a1, 6);
                        
                        }));
                subContent.addComponent(new Button("7",
                		 e -> {Notification.show("LLAMANDO PISO 7");
                         edificio.llamarAscensor(a1, 7);
                         
                         }));
                 
                 subContent.addComponent(new Button("\nAbrir Puertas",
                         e -> {
                         	a1.abrirPuertas(a1);
                         
                         }));
                 
                 subContent.addComponent(new Button("Cerrar Puertas",
                         e -> {
                         	a1.cerrarPuertas(a1);
                         
                         }));
                 
                 subContent.addComponent(new Button("Piso Actual",
                         e -> {
                         	a1.notifyObservers();
                         
                         }));
                 
                 subContent.addComponent(new Button("Estado de las puertas",
                         e -> {
                         	a1.saberEstado(a1);
                         
                         }));
                 

                 // Open it in the UI
                 addWindow(subWindow);
                 //------------------
                 
                 }));
      	
      	
      	
      //----------------------------------------------------------------
      	
 //---------------------------------------------------------------
      	
      	hlayout.addComponent(new Button("LLAMAR AL ASCENSOR 2",
      			click -> {
      			Window subWindow = new Window("ASCENSOR 2");
                 VerticalLayout subContent = new VerticalLayout();
                 subWindow.setContent(subContent);
                 
              

                 // Set window size.
                 subWindow.setHeight("600px");
                 subWindow.setWidth("400px");
                 subWindow.setPositionX(1400);
                 subWindow.setPositionY(50);


                 // Put some components in it
                 subContent.addComponent(new Label("ESTAS USANDO EL ASCENSOR 2\n"));
                 
                 subContent.addComponent(new Button("1\n",
                         e -> {Notification.show("LLAMANDO PISO 1");
                         edificio.llamarAscensor(a2, 1);
                         }));
                 
                 subContent.addComponent(new Button("2",
                         e -> {Notification.show("LLAMANDO PISO 2");
                         edificio.llamarAscensor(a2, 2);
                         
                         }));
                 subContent.addComponent(new Button("3",
                         e -> {Notification.show("LLAMANDO PISO 3");
                         edificio.llamarAscensor(a2, 3);
                         
                         }));
                 subContent.addComponent(new Button("4",
                         e -> {Notification.show("LLAMANDO PISO 4");
                         edificio.llamarAscensor(a2, 4);
                         
                         }));
                 subContent.addComponent(new Button("5",
                         e -> {Notification.show("LLAMANDO PISO 5");
                         edificio.llamarAscensor(a2, 5);
                         
                         }));
                 subContent.addComponent(new Button("6",
                         e -> {Notification.show("LLAMANDO PISO 6");
                         edificio.llamarAscensor(a2, 6);
                         
                         }));
                 subContent.addComponent(new Button("7",
                         e -> {Notification.show("LLAMANDO PISO 7");
                         edificio.llamarAscensor(a2, 7);
                         
                         }));
                 
                 subContent.addComponent(new Button("\nAbrir Puertas",
                         e -> {
                         	a2.abrirPuertas(a2);
                         
                         }));
                 
                 subContent.addComponent(new Button("Cerrar Puertas",
                         e -> {
                         	a2.cerrarPuertas(a2);
                         
                         }));
                 
                 subContent.addComponent(new Button("Piso Actual",
                         e -> {
                         	a2.notifyObservers();
                         
                         }));
                 
                 subContent.addComponent(new Button("Estado de las puertas",
                         e -> {
                         	a2.saberEstado(a2);
                         
                         }));
   
                 // Open it in the UI
                 addWindow(subWindow);
                 //------------------
                 
                 }));
      	
      	
      	
      //----------------------------------------------------------------
      	
 //---------------------------------------------------------------
      	
      	hlayout.addComponent(new Button("LLAMAR AL ASCENSOR 3\n",
      			click -> {
      			Window subWindow = new Window("ASCENSOR 3");
                 VerticalLayout subContent = new VerticalLayout();
                 subWindow.setContent(subContent);
                 
              

                 // Set window size.
                 subWindow.setHeight("600px");
                 subWindow.setWidth("400px");
                 // Set window position.
                 subWindow.setPositionX(200);
                 subWindow.setPositionY(50);


                 // Put some components in it
                 subContent.addComponent(new Label("ESTAS USANDO EL ASCENSOR 3\n"));
                 
                 subContent.addComponent(new Button("1\n",
                         e -> {Notification.show("LLAMANDO PISO 1");
                         edificio.llamarAscensor(a3, 1);
                         
                         }));
                 
                 subContent.addComponent(new Button("2",
                         e -> {Notification.show("LLAMANDO PISO 2");
                         edificio.llamarAscensor(a3, 2);
                         
                         }));
                         subContent.addComponent(new Button("3",
                                 e -> {Notification.show("LLAMANDO PISO 3");
                                 edificio.llamarAscensor(a3, 3);
                                 
                                 }));
                         subContent.addComponent(new Button("4",
                                 e -> {Notification.show("LLAMANDO PISO 4");
                                 edificio.llamarAscensor(a3, 4);
                                 
                                 }));
                         subContent.addComponent(new Button("5",
                                 e -> {Notification.show("LLAMANDO PISO 5");
                                 edificio.llamarAscensor(a3, 5);
                                 
                                 }));
                         subContent.addComponent(new Button("6",
                                 e -> {Notification.show("LLAMANDO PISO 6");
                                 edificio.llamarAscensor(a3, 6);
                                 
                                 }));
                         subContent.addComponent(new Button("7",
                                 e -> {Notification.show("LLAMANDO PISO 7");
                                 edificio.llamarAscensor(a3, 7);
                                 
                                 }));
                         
                         subContent.addComponent(new Button("\nAbrir Puertas",
                                 e -> {
                                 	a3.abrirPuertas(a3);
                                 
                                 }));
                         
                         subContent.addComponent(new Button("Cerrar Puertas",
                                 e -> {
                                 	a3.cerrarPuertas(a3);
                                 
                                 }));
                         
                         subContent.addComponent(new Button("Piso Actual",
                                 e -> {
                                 	a3.notifyObservers();
                                 
                                 }));
                         
                         subContent.addComponent(new Button("Estado de las puertas",
                                 e -> {
                                 	a3.saberEstado(a3);
                                 
                                 }));
                   

                         // Open it in the UI
                         addWindow(subWindow);
                         //------------------
                         
                         }));
              	
              	
              	
              //----------------------------------------------------------------
                 
                 layout.addComponents(hlayout);       
                 hlayout.addComponents();
                 layout.setMargin(true);
                 layout.setSpacing(true);
                 
                 setContent(layout);
             }

             @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
             @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
             public static class MyUIServlet extends VaadinServlet {
             }
         }
