package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@3667faa8;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 25627
 */
public class M996A1Ambulance extends EntityType
{
    /** Default constructor */
    public M996A1Ambulance()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 10348, Small Wheeled Utility Vehicle
        setSubCategory((byte)1); // uid 10349, High Mobility Multipurpose Wheeled Vehicle (HMMWV) Humvee
        setSpecific((byte)11); // uid 10360, M996 Mini-Ambulance (2-Litter)
        setExtra((byte)1); // uid 25627, M996A1 Ambulance
    }
}
