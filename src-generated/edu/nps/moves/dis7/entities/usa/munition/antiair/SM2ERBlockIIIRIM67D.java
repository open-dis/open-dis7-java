package edu.nps.moves.dis7.entities.usa.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@68e47e7;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: ANTI_AIR;
 *
 * Entity type uid: 29088
 */
public class SM2ERBlockIIIRIM67D extends EntityType
{
    /** Default constructor */
    public SM2ERBlockIIIRIM67D()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 19406, Guided
        setSubCategory((byte)27); // uid 19475, Standard Missile
        setSpecific((byte)2); // uid 19486, Standard ER (RIM-67 / RIM-156)
        setExtra((byte)3); // uid 29088, SM-2ER Block III (RIM-67D)
    }
}
