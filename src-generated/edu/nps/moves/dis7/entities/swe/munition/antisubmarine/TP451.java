package edu.nps.moves.dis7.entities.swe.munition.antisubmarine;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@589dfa6f;
 * Country: Sweden (SWE);
 * Entity kind: Munition;
 * Domain: ANTI_SUBMARINE;
 *
 * Entity type uid: 29566
 */
public class TP451 extends EntityType
{
    /** Default constructor */
    public TP451()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SUBMARINE));

        setCategory((byte)1); // uid 27010, Guided
        setSubCategory((byte)3); // uid 27021, Torpedo 45 (Tp 45)
        setSpecific((byte)1); // uid 29566, TP 451
    }
}
