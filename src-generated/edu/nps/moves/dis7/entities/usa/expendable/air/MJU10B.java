package edu.nps.moves.dis7.entities.usa.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@38cb1606;
 * Country: United States of America (USA);
 * Entity kind: Expendable;
 * Domain: AIR;
 *
 * Entity type uid: 24165
 */
public class MJU10B extends EntityType
{
    /** Default constructor */
    public MJU10B()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 22242, Flare
        setSubCategory((byte)3); // uid 22247, MJU-10 Flare
        setSpecific((byte)1); // uid 24165, MJU-10/B
    }
}
