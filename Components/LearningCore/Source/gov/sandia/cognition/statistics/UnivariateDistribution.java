/*
 * File:                UnivariateDistribution.java
 * Authors:             Kevin R. Dixon
 * Company:             Sandia National Laboratories
 * Project:             Cognitive Foundry
 * 
 * Copyright Jan 27, 2009, Sandia Corporation.
 * Under the terms of Contract DE-AC04-94AL85000, there is a non-exclusive
 * license for use of this work by or on behalf of the U.S. Government. 
 * Export of this program may require a license from the United States
 * Government. See CopyrightHistory.txt for complete details.
 * 
 */

package gov.sandia.cognition.statistics;

/**
 * A Distribution that takes Doubles as inputs and can compute its variance.
 * @param <NumberType> Type of Number that can be sampled from this distribution.
 * @author Kevin R. Dixon
 * @since 3.0
 */
public interface UnivariateDistribution<NumberType extends Number>
    extends DistributionWithMean<NumberType>
{

    /**
     * Gets the minimum support (domain or input) of the distribution.
     * @return
     * Minimum support.
     */
    public NumberType getMinSupport();

    /**
     * Gets the minimum support (domain or input) of the distribution.
     * @return
     * Minimum support.
     */
    public NumberType getMaxSupport();

    /**
     * Gets the CDF of a scalar distribution.
     * @return
     * CDF of the scalar distribution.
     */
    public CumulativeDistributionFunction<NumberType> getCDF();

    /**
     * Gets the mean of the distribution as a double.
     * 
     * @return 
     *      The mean as a double.
     */
    public double getMeanAsDouble();
    
    /**
     * Gets the variance of the distribution.  This is sometimes called
     * the second central moment by more pedantic people, which is equivalent
     * to the square of the standard deviation.
     * @return
     * Variance of the distribution.
     */
    public double getVariance();
    
}
