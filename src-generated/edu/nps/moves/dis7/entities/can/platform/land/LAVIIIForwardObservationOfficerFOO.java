package edu.nps.moves.dis7.entities.can.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4bec1f0c;
 * Country: Canada (CAN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31848
 */
public class LAVIIIForwardObservationOfficerFOO extends EntityType
{
    /** Default constructor */
    public LAVIIIForwardObservationOfficerFOO()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 30991, Armored Fighting Vehicle
        setSubCategory((byte)5); // uid 31845, Light Armored Vehicle - LAV III
        setSpecific((byte)3); // uid 31848, LAV-III Forward Observation Officer (FOO)
    }
}
