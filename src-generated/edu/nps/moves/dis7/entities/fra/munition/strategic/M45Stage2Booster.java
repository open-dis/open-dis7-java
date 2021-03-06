package edu.nps.moves.dis7.entities.fra.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@51e8d066;
 * Country: France (FRA);
 * Entity kind: Munition;
 * Domain: STRATEGIC;
 *
 * Entity type uid: 32465
 */
public class M45Stage2Booster extends EntityType
{
    /** Default constructor */
    public M45Stage2Booster()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 21195, Guided
        setSubCategory((byte)5); // uid 29001, M45 SLBM
        setSpecific((byte)5); // uid 32465, M45 Stage 2 Booster
    }
}
