package edu.nps.moves.dis7.entities.fra.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@530ee28b;
 * Country: France (FRA);
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 24024
 */
public class APFSDSOFL120F1 extends EntityType
{
    /** Default constructor */
    public APFSDSOFL120F1()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 21065, Ballistic
        setSubCategory((byte)12); // uid 21077, 120 mm
        setSpecific((byte)1); // uid 24024, APFSDS, OFL 120 F1
    }
}
