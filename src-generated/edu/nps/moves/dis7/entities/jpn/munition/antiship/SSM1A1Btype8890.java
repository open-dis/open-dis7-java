package edu.nps.moves.dis7.entities.jpn.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7af327e3;
 * Country: Japan (JPN);
 * Entity kind: Munition;
 * Domain: ANTI_SHIP;
 *
 * Entity type uid: 21692
 */
public class SSM1A1Btype8890 extends EntityType
{
    /** Default constructor */
    public SSM1A1Btype8890()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 21690, Guided
        setSubCategory((byte)2); // uid 21692, SSM-1A/1B (type 88/90)
    }
}
