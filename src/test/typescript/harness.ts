import {
  RecipeApplication
} from "@aire-ux/aire-recipes/aire-recipes";

export default function setup() {


  window.customElements.define(
      'aire-recipes',
      RecipeApplication
  );
  Object.defineProperty(window.location, 'href', {
    writable: true,
    value: 'https://localhost'
  });
  // (window as any).chai.use(chaiDomDiff);
}
setup();