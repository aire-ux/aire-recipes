package io.sunshower.aire.ux.components.routes;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.RouteScope;
import io.sunshower.aire.ux.components.RecipeApplication;

@RouteScope
@Route("aire-recipes")
public class RecipeApplicationRoute extends VerticalLayout {


  public RecipeApplicationRoute() {
    add(new RecipeApplication());
  }
}
