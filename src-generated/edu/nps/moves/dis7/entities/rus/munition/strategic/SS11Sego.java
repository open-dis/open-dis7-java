package edu.nps.moves.dis7.entities.rus.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4a660b34;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: STRATEGIC;
 *
 * Entity type uid: 32374
 */
public class SS11Sego extends EntityType
{
    /** Default constructor */
    public SS11Sego()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 20919, Guided
        setSubCategory((byte)45); // uid 32374, SS-11 Sego
    }
}
