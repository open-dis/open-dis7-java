package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5d4e13e1;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 10150
 */
public class YPR765PRCOBcommandvehicle extends EntityType
{
    /** Default constructor */
    public YPR765PRCOBcommandvehicle()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 10067, Armored Fighting Vehicle
        setSubCategory((byte)6); // uid 10148, FMC Armored IFV
        setSpecific((byte)2); // uid 10150, YPR 765 PRCO-B command vehicle
    }
}
