/*
 * Copyright (C) 2005-2017 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */

package org.truelicense.it.v2.json

import org.truelicense.it.core.LicenseConsumerPerformance

/** @author Christian Schlichtherle */
object V2JsonLicenseConsumerPerformance
extends LicenseConsumerPerformance with V2JsonTestContext {
  def main(args: Array[String]) = call ()
}
