import "./harness";

import {
  fixture,
  expect, nextFrame,
} from "@open-wc/testing";

import {
  beforeEach,
  describe,
  it,
  vi
} from "vitest";
import {
  RecipeApplication
} from "@aire-ux/aire-recipes/aire-recipes"


import {html} from "lit";


describe('a aire-recipes', async () => {
  let element: RecipeApplication;
  beforeEach(async () => {
    element = await fixture(html`
      <aire-recipes></aire-recipes>
    `);

    await nextFrame();
  });

  it('should mount the component', () => {
    let elements = document.querySelectorAll('aire-recipes');
    expect(elements.length).to.equal(1);
  });

});