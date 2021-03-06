/**
 *
 * $Id$
 */
package net.opengis.wps10.validation;

import net.opengis.wps10.WSDLType;

/**
 * A sample validator interface for {@link net.opengis.wps10.ProcessBriefType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ProcessBriefTypeValidator {
  boolean validate();

  boolean validateProfile(String value);
  boolean validateWSDL(WSDLType value);
  boolean validateProcessVersion(String value);
}
