/*
 * File:            Regressor.java
 * Authors:         Justin Basilico
 * Project:         Cognitive Foundry Learning Core
 * 
 * Copyright 2011 Justin Basilico. All rights reserved.
 */

package gov.sandia.cognition.learning.function.regression;

import gov.sandia.cognition.math.ScalarFunction;

/**
 * Defines the functionality of a regression function, which is the model
 * created by regression algorithms. It produces a scalar value as the result
 * of evaluating an input. This class primarily defines a convenience method
 * that helps avoid the creation of new Double objects when using regression
 * functions.
 *
 * @param   <InputType>
 *      The type of the input to the regressor.
 * @author  Justin Basilico
 * @version 3.4.0
 */
public interface Regressor<InputType>
    extends ScalarFunction<InputType>
{
    
}
