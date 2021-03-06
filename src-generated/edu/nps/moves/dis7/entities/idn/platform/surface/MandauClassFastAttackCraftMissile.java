package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@628c4ac0;
 * Country: Indonesia (IDN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 29810
 */
public class MandauClassFastAttackCraftMissile extends EntityType
{
    /** Default constructor */
    public MandauClassFastAttackCraftMissile()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)64); // uid 29615, Fast Attack Craft
        setSubCategory((byte)3); // uid 29810, Mandau Class (Fast Attack Craft-Missile)
    }
}
