package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3e4afd10;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: LAND;
 *
 * Entity type uid: 26484
 */
public class PressureCookerWithWire extends EntityType
{
    /** Default constructor */
    public PressureCookerWithWire()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)22); // uid 26475, Appliances
        setSubCategory((byte)1); // uid 26476, Countertop
        setSpecific((byte)4); // uid 26484, Pressure Cooker With Wire
    }
}
