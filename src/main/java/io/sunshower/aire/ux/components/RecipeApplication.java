package io.sunshower.aire.ux.components;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.HtmlContainer;

@Tag("aire-recipes")
@JsModule(Paths.RecipeApplication_SOURCE)
@CssImport(Paths.RecipeApplication_STYLES)
//@JsModule("@aire-ux/aire-recipes/aire-recipes")
//@CssImport("@aire-ux/aire-recipes/styles/aire-recipes.css")

/**
 * uncomment this if you have deployed this component into NPMJS
 */
//@NpmPackage(value = "@${organzation}/@aire-recipes", version = Versions.RecipeApplication_VERSION)
public class RecipeApplication extends HtmlContainer {

  public RecipeApplication() {
    add(new Button("Hello from RecipeApplication!"));
  }

}