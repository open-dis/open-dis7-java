package edu.nps.moves.dis7.entities.chn.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@20349058;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Munition;
 * Domain: STRATEGIC;
 *
 * Entity type uid: 32789
 */
public class DF26BSecondStageVehicle extends EntityType
{
    /** Default constructor */
    public DF26BSecondStageVehicle()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 21556, Guided
        setSubCategory((byte)38); // uid 32788, DF-26B
        setSpecific((byte)1); // uid 32789, DF-26B Second Stage Vehicle
    }
}
