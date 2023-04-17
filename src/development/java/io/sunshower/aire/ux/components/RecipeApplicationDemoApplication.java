package io.sunshower.aire.ux.components;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.spring.annotation.EnableVaadin;
import io.sunshower.aire.ux.components.routes.RecipeApplicationRoute;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@PWA(name = "RecipeApplication Demo", shortName = "Demo")
@ComponentScan(basePackageClasses = RecipeApplicationRoute.class)
@EnableVaadin({"io.sunshower.aire.ux.components.routes"})
public class RecipeApplicationDemoApplication extends VerticalLayout
    implements AppShellConfigurator {

  public static void main(String[] args) {
    SpringApplication.run(RecipeApplicationDemoApplication.class, args);
  }
}
