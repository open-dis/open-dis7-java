package edu.nps.moves.dis7.entities.cze.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2b662a77;
 * Country: Czech Republic (CZE);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 30088
 */
public class AeroL39ZAlbatros extends EntityType
{
    /** Default constructor */
    public AeroL39ZAlbatros()
    {
        setCountry(Country.CZECH_REPUBLIC_CZE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 30087, Attack/Strike
        setSubCategory((byte)1); // uid 30088, Aero L-39Z Albatros
    }
}
