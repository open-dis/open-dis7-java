package edu.nps.moves.dis7.entities.swe.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@54f2df29;
 * Country: Sweden (SWE);
 * Entity kind: Munition;
 * Domain: ANTI_SHIP;
 *
 * Entity type uid: 29564
 */
public class Torped613 extends EntityType
{
    /** Default constructor */
    public Torped613()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 27301, Guided
        setSubCategory((byte)3); // uid 29563, Torped 61 (TP 61)
        setSpecific((byte)1); // uid 29564, Torped 613
    }
}
