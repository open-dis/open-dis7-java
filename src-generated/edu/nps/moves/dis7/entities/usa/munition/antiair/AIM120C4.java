package edu.nps.moves.dis7.entities.usa.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@4cecc15a;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: ANTI_AIR;
 *
 * Entity type uid: 26224
 */
public class AIM120C4 extends EntityType
{
    /** Default constructor */
    public AIM120C4()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 19406, Guided
        setSubCategory((byte)2); // uid 19419, AIM-120 Advanced Medium-Range Air-to-Air Missile (AMRAAM)
        setSpecific((byte)3); // uid 19422, AIM-120C
        setExtra((byte)4); // uid 26224, AIM-120C-4
    }
}
