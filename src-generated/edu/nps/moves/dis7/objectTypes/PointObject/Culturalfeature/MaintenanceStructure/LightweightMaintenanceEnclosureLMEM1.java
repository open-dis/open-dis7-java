package edu.nps.moves.dis7.objectTypes.PointObject.Culturalfeature.MaintenanceStructure;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * ObjectType uid: 226
 */
public class LightweightMaintenanceEnclosureLMEM1 extends ObjectType
{
    /** Default constructor */
    public LightweightMaintenanceEnclosureLMEM1()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(3)); // Cultural feature
        setCategory((byte)6); // Maintenance Structure
        setSubCategory((byte)2); // Lightweight Maintenance Enclosure (LME), M1
    }
}
