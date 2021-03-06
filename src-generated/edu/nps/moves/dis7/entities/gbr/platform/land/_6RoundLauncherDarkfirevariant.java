package edu.nps.moves.dis7.entities.gbr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@9679750;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 14981
 */
public class _6RoundLauncherDarkfirevariant extends EntityType
{
    /** Default constructor */
    public _6RoundLauncherDarkfirevariant()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 14976, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 14977, Rapier SAM System
        setSpecific((byte)2); // uid 14979, Rapier Launcher
        setExtra((byte)2); // uid 14981, 6-Round Launcher (Darkfire variant)
    }
}
