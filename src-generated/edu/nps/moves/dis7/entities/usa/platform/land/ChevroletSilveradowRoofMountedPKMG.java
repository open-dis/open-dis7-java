package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@4570d7b6
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 24941
 */
public class ChevroletSilveradowRoofMountedPKMG extends EntityType
{
    public ChevroletSilveradowRoofMountedPKMG()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)83); // uid 24926, Single Unit Cargo Truck
        setSubCategory((byte)4); // uid 24939, Pickup Truck, Crew Cab
        setSpecific((byte)1); // uid 24940, Chevrolet Silverado
        setExtra((byte)1); // uid 24941, Chevrolet Silverado w/ Roof-Mounted PK MG
    }
}
