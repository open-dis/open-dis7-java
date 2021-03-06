package edu.nps.moves.dis7.entities.usa.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@42cc5460;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 20023
 */
public class M352HE extends EntityType
{
    /** Default constructor */
    public M352HE()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 19971, Ballistic
        setSubCategory((byte)7); // uid 20022, 76 mm
        setSpecific((byte)1); // uid 20023, M352 HE
    }
}
