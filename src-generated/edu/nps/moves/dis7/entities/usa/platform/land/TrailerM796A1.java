package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2ceee4b6;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 33065
 */
public class TrailerM796A1 extends EntityType
{
    /** Default constructor */
    public TrailerM796A1()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)14); // uid 10616, Cargo Trailer
        setSubCategory((byte)3); // uid 10620, 2.01 - 5 ton
        setSpecific((byte)4); // uid 33065, Trailer, M796A1
    }
}
