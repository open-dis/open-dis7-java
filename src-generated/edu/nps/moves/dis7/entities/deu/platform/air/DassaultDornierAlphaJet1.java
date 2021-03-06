package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6aa8e115;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 16383
 */
public class DassaultDornierAlphaJet1 extends EntityType
{
    /** Default constructor */
    public DassaultDornierAlphaJet1()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 16382, Trainer
        setSubCategory((byte)1); // uid 16383, Dassault/Dornier Alpha Jet
    }
}
