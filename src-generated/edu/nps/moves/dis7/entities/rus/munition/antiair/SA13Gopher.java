package edu.nps.moves.dis7.entities.rus.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3111631d;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: ANTI_AIR;
 *
 * Entity type uid: 20370
 */
public class SA13Gopher extends EntityType
{
    /** Default constructor */
    public SA13Gopher()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 20301, Guided
        setSubCategory((byte)25); // uid 20370, SA-13 Gopher
    }
}
