package org.ovirt.engine.core.bll.scheduling.policyunits;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CpuOverloadPolicyUnitTest {
    @Test
    public void testGetHighUtilizationForAllCores() throws Exception {
        CpuOverloadPolicyUnit policyUnit = new CpuOverloadPolicyUnit(null, null);

        assertEquals(90, policyUnit.getHighUtilizationForAllCores(90, 1));
        assertEquals(100, policyUnit.getHighUtilizationForAllCores(100, 1));
        assertEquals(100, policyUnit.getHighUtilizationForAllCores(100, 100));
        assertEquals(100, policyUnit.getHighUtilizationForAllCores(99, 100));
        assertEquals(100, policyUnit.getHighUtilizationForAllCores(99, 200));
        assertEquals(75, policyUnit.getHighUtilizationForAllCores(50, 2));
        assertEquals(80, policyUnit.getHighUtilizationForAllCores(60, 2));
    }
}
