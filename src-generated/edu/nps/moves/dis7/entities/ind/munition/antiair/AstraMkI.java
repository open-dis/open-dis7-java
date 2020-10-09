package edu.nps.moves.dis7.entities.ind.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@463045fb
 * Country: India (IND)
 * Entity kind: Munition
 * Domain: ANTI_AIR
 *
 * Entity type uid: 28963
 */
public class AstraMkI extends EntityType
{
    public AstraMkI()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 21742, Guided
        setSubCategory((byte)2); // uid 28962, Astra
        setSpecific((byte)1); // uid 28963, Astra Mk.I
    }
}
