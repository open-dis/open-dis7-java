package edu.nps.moves.dis7.entities.rus.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@33d230ce;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 23939
 */
public class _3BM2APFSDST extends EntityType
{
    /** Default constructor */
    public _3BM2APFSDST()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 20445, Ballistic
        setSubCategory((byte)19); // uid 20484, 100 mm
        setSpecific((byte)5); // uid 23939, 3BM2 APFSDS-T
    }
}
