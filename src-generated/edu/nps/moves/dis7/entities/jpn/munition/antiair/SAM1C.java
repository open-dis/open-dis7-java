package edu.nps.moves.dis7.entities.jpn.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7b297740;
 * Country: Japan (JPN);
 * Entity kind: Munition;
 * Domain: ANTI_AIR;
 *
 * Entity type uid: 29027
 */
public class SAM1C extends EntityType
{
    /** Default constructor */
    public SAM1C()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 28969, Guided
        setSubCategory((byte)4); // uid 29024, Type 81 Tan-SAM
        setSpecific((byte)3); // uid 29027, SAM-1C
    }
}
