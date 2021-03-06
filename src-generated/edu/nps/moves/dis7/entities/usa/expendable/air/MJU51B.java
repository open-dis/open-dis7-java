package edu.nps.moves.dis7.entities.usa.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@36871e98;
 * Country: United States of America (USA);
 * Entity kind: Expendable;
 * Domain: AIR;
 *
 * Entity type uid: 24188
 */
public class MJU51B extends EntityType
{
    /** Default constructor */
    public MJU51B()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 22242, Flare
        setSubCategory((byte)19); // uid 24187, MJU-51 Flare
        setSpecific((byte)1); // uid 24188, MJU-51/B
    }
}
