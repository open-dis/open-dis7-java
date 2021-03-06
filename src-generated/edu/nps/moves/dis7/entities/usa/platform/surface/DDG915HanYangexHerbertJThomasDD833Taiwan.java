package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2b53840a;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 11453
 */
public class DDG915HanYangexHerbertJThomasDD833Taiwan extends EntityType
{
    /** Default constructor */
    public DDG915HanYangexHerbertJThomasDD833Taiwan()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 11372, Guided Missile Destroyer
        setSubCategory((byte)7); // uid 11451, Gearing (Wu Chin I and II Conversions) (FRAM I and II) Class
        setSpecific((byte)2); // uid 11453, DDG 915 Han Yang (ex. Herbert J. Thomas DD 833) (Taiwan)
    }
}
