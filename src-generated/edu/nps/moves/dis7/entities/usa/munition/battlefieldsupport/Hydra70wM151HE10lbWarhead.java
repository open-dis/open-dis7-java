package edu.nps.moves.dis7.entities.usa.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@49d42faf;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 20151
 */
public class Hydra70wM151HE10lbWarhead extends EntityType
{
    /** Default constructor */
    public Hydra70wM151HE10lbWarhead()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 19971, Ballistic
        setSubCategory((byte)21); // uid 20150, Hydra 70 Rocket System (70 mm, 2.75 in)
        setSpecific((byte)1); // uid 20151, Hydra 70 w/ M151 HE (10 lb) Warhead
    }
}
