package edu.nps.moves.dis7.entities.usa.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@27dfd12b;
 * Country: United States of America (USA);
 * Entity kind: Expendable;
 * Domain: AIR;
 *
 * Entity type uid: 24163
 */
public class MJU7B extends EntityType
{
    /** Default constructor */
    public MJU7B()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 22242, Flare
        setSubCategory((byte)2); // uid 22246, MJU-7 Flare
        setSpecific((byte)1); // uid 24163, MJU-7/B
    }
}
