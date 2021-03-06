package edu.nps.moves.dis7.entities.jpn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@376a312c;
 * Country: Japan (JPN);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 29177
 */
public class MitsubishiATDXShinshin extends EntityType
{
    /** Default constructor */
    public MitsubishiATDXShinshin()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 24798, Fighter/Air Defense
        setSubCategory((byte)4); // uid 29177, Mitsubishi ATD-X Shinshin
    }
}
